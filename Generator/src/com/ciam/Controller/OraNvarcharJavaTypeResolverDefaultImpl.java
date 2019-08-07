package com.ciam.Controller;

import java.sql.Types;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;
 
public class OraNvarcharJavaTypeResolverDefaultImpl extends JavaTypeResolverDefaultImpl {
	public OraNvarcharJavaTypeResolverDefaultImpl() {
        super();
      //把数据库的 NVARCHAR2 映射成 String
        super.typeMap.put(Types.OTHER, new JdbcTypeInformation("NVARCHAR2", new FullyQualifiedJavaType(String.class.getName())));
    }
}
