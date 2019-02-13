package com.yyq.car.portal.common.plugin;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.internal.util.JavaBeansUtil;


public class RenameFileNamePlugin extends PluginAdapter {

	private Pattern pattern;
	private String searchString;
	private String replaceString;
	private String prefix = "";
	private String suffix = "_SqlMap.xml";

	@Override
	public boolean validate(List<String> warnings) {

		searchString = properties.getProperty("searchString");
		replaceString = properties.getProperty("replaceString") == null ? "" : properties.getProperty("replaceString");
		prefix = properties.getProperty("prefix") == null ? "" : properties.getProperty("prefix");
		suffix = properties.getProperty("suffix") == null ? "" : properties.getProperty("suffix");

		boolean valid = stringHasValue(searchString);

		if (valid) {
			pattern = Pattern.compile(searchString);
		} else {
			if (!stringHasValue(searchString)) {
				warnings.add(getString("ValidationError.18", "RenameSqlMapFileNamePlugin", "searchString"));
			}
			if (!stringHasValue(replaceString)) {
				warnings.add(getString("ValidationError.18", "RenameSqlMapFileNamePlugin", "replaceString"));
			}
		}

		return valid;
	}

	@Override
	public void initialized(IntrospectedTable introspectedTable) {
		FullyQualifiedTable table = introspectedTable.getFullyQualifiedTable();
		String tableName = table.getIntrospectedTableName();
		
		Matcher matcher = pattern.matcher(tableName);
		String genTableName = matcher.replaceAll(replaceString);
		genTableName = prefix + JavaBeansUtil.getCamelCaseString(genTableName, true) + suffix;
		introspectedTable.setMyBatis3XmlMapperFileName(genTableName);

	}

}
