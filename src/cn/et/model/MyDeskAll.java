package cn.et.model;

import java.util.List;
import java.util.Map;

public class MyDeskAll {
	public List<Map> getTableLIstAll() throws Exception {
		String sql = "select * from desk";
		return DbUtils.query(sql);
	}
}
 