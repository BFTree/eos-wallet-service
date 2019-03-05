package it.etoken.component.eosblock.dao.provider;

import it.etoken.base.model.eosblock.entity.Delegatebw;
import it.etoken.base.model.eosblock.entity.DelegatebwExample.Criteria;
import it.etoken.base.model.eosblock.entity.DelegatebwExample.Criterion;
import it.etoken.base.model.eosblock.entity.DelegatebwExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DelegatebwSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delegatebw
     *
     * @mbg.generated Thu Aug 23 17:38:01 CST 2018
     */
    public String countByExample(DelegatebwExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("delegatebw");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delegatebw
     *
     * @mbg.generated Thu Aug 23 17:38:01 CST 2018
     */
    public String deleteByExample(DelegatebwExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("delegatebw");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delegatebw
     *
     * @mbg.generated Thu Aug 23 17:38:01 CST 2018
     */
    public String insertSelective(Delegatebw record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("delegatebw");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getAccountName() != null) {
            sql.VALUES("account_name", "#{accountName,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=BIGINT}");
        }
        
        if (record.getCpu() != null) {
            sql.VALUES("cpu", "#{cpu,jdbcType=VARCHAR}");
        }
        
        if (record.getNet() != null) {
            sql.VALUES("net", "#{net,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedate() != null) {
            sql.VALUES("createdate", "#{createdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifydate() != null) {
            sql.VALUES("modifydate", "#{modifydate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delegatebw
     *
     * @mbg.generated Thu Aug 23 17:38:01 CST 2018
     */
    public String selectByExample(DelegatebwExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("account_name");
        sql.SELECT("status");
        sql.SELECT("cpu");
        sql.SELECT("net");
        sql.SELECT("createdate");
        sql.SELECT("modifydate");
        sql.FROM("delegatebw");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delegatebw
     *
     * @mbg.generated Thu Aug 23 17:38:01 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Delegatebw record = (Delegatebw) parameter.get("record");
        DelegatebwExample example = (DelegatebwExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("delegatebw");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getAccountName() != null) {
            sql.SET("account_name = #{record.accountName,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=BIGINT}");
        }
        
        if (record.getCpu() != null) {
            sql.SET("cpu = #{record.cpu,jdbcType=VARCHAR}");
        }
        
        if (record.getNet() != null) {
            sql.SET("net = #{record.net,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedate() != null) {
            sql.SET("createdate = #{record.createdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifydate() != null) {
            sql.SET("modifydate = #{record.modifydate,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delegatebw
     *
     * @mbg.generated Thu Aug 23 17:38:01 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("delegatebw");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("account_name = #{record.accountName,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=BIGINT}");
        sql.SET("cpu = #{record.cpu,jdbcType=VARCHAR}");
        sql.SET("net = #{record.net,jdbcType=VARCHAR}");
        sql.SET("createdate = #{record.createdate,jdbcType=TIMESTAMP}");
        sql.SET("modifydate = #{record.modifydate,jdbcType=TIMESTAMP}");
        
        DelegatebwExample example = (DelegatebwExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delegatebw
     *
     * @mbg.generated Thu Aug 23 17:38:01 CST 2018
     */
    public String updateByPrimaryKeySelective(Delegatebw record) {
        SQL sql = new SQL();
        sql.UPDATE("delegatebw");
        
        if (record.getAccountName() != null) {
            sql.SET("account_name = #{accountName,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=BIGINT}");
        }
        
        if (record.getCpu() != null) {
            sql.SET("cpu = #{cpu,jdbcType=VARCHAR}");
        }
        
        if (record.getNet() != null) {
            sql.SET("net = #{net,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedate() != null) {
            sql.SET("createdate = #{createdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifydate() != null) {
            sql.SET("modifydate = #{modifydate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delegatebw
     *
     * @mbg.generated Thu Aug 23 17:38:01 CST 2018
     */
    protected void applyWhere(SQL sql, DelegatebwExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}