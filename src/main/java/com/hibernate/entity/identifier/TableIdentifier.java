package com.hibernate.entity.identifier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public  class TableIdentifier {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,
	generator= "tab-gen")
	@TableGenerator(
			name = "tab-gen",
			table = "table_id",
			allocationSize = 8,
			pkColumnName = "id_col",
			valueColumnName ="val_col"
			)
	
	public long tableId;
	public String TableName;

}
