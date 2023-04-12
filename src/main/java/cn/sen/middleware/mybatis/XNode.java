package cn.sen.middleware.mybatis;

import java.util.Map;

/**
 * @Author caosen
 * @Date 2023/4/10 10:56
 */
public class XNode {

    private String namespace;

    private String id;

    private String parameterType;

    private String resultType;

    private String sql;

    private Map<Integer, String> parameter;

    public XNode() {
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<Integer, String> getParameter() {
        return parameter;
    }



    public void setParameter(Map<Integer, String> parameter) {
        this.parameter = parameter;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getParameterType() {
        return parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }
}
