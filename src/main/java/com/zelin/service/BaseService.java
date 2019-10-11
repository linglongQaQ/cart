package com.zelin.service;

import com.zelin.dbutils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;

/**
 * @author: wangyilong
 * @Date: 2019/10/10 0010
 * @Description:
 */
public class BaseService {

   protected static QueryRunner runner = new QueryRunner(DBUtils.dataSource);
}
