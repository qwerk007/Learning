package com.hibernate.entity.identifier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class SequenceIdentifier {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE
	generator= "tab-gen")
	@GenericGenerator(
			name = "tab-gen",
			strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
			parameters = {
				@Parameter(name = "sequence_name", value = "product_sequence"),
				@Parameter(name = "initial_value", value = "1"),
				@Parameter(name = "increment_size", value = "3"),
				@Parameter(name = "optimizer", value = "pooled-lo")
			}
		)
	/*@TableGenerator(
			name = "tab-gen",
			table = "table_id",
			allocationSize = 8,
			pkColumnName = "id_col",
			valueColumnName ="val_col"
			)*/
	
	public long tableId;
	public String TableName;
}
