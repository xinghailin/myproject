package com.yyq.car.portal.common.plugin;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;


public class AddAnnotationsAndImportsPlugin extends PluginAdapter {

	private String imports = "";
	private String annotations = "";

	@Override
	public boolean validate(List<String> warnings) {

		imports = this.properties.getProperty("imports");
		annotations = this.properties.getProperty("annotations");
		boolean valid = stringHasValue(imports) || stringHasValue(annotations);

		if (!valid) {
			warnings.add(getString("ValidationError.18", //$NON-NLS-1$
					"AddAnnotationPlugin", //$NON-NLS-1$
					"imports or annotations")); //$NON-NLS-1$
		}

		return valid;
	}

	public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass,
	            IntrospectedTable introspectedTable)
	 {
		 //add import statement in Mapper interface file
		 if(stringHasValue(imports))
		 {
			 String[] imp = imports.split(",");
			 for(String s : imp)
			 {
				 FullyQualifiedJavaType type = new FullyQualifiedJavaType(s);
				 interfaze.addImportedType(type);
			 }
		 }
//		 interfaze.addFormattedAnnotations(new StringBuilder("@SoofaMapper"), 0);
		 //add annotation in Mapper interface file
		 if(stringHasValue(annotations))
		 {
			 String [] ann = annotations.split(",");
			 for(String s : ann)
			 {
				 interfaze.addAnnotation(s);
//				 topLevelClass.addAnnotation(s);
			 }
		 }
		 interfaze.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.session.RowBounds"));
		 interfaze.addImportedType(new FullyQualifiedJavaType("java.util.List"));
		 
		 Method method1 =new Method();
		 method1.setName("selectByCriteria");
		 FullyQualifiedJavaType parameterType = introspectedTable.getRules().calculateAllFieldsClass();
		 String modelClassName=parameterType.getShortName();
		 method1.setReturnType(new FullyQualifiedJavaType("List<"+modelClassName+">"));
		 Parameter parameter0=new Parameter(parameterType, "record");
		 FullyQualifiedJavaType rowBoundsType=new FullyQualifiedJavaType("org.apache.ibatis.session.RowBounds");
		 Parameter parameter1=new Parameter(rowBoundsType, "rowBounds");
		 method1.addParameter(0, parameter0);
		 method1.addParameter(1, parameter1);
		 interfaze.addMethod(method1);
		 
		 Method method2 =new Method();
		 method2.setName("selectByCriteria");
		 method2.setReturnType(new FullyQualifiedJavaType("List<"+modelClassName+">"));
		 method2.addParameter(0, parameter0);
		 interfaze.addMethod(method2);
		 
		 Method method3 =new Method();
		 method3 =new Method();
		 method3.setName("countByCriteria");
		 method3.setReturnType(new FullyQualifiedJavaType("int"));
		 method3.addParameter(0, parameter0);
		 interfaze.addMethod(method3);
		return true;
	 }
}
