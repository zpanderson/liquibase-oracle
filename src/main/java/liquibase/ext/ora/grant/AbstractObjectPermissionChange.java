package liquibase.ext.ora.grant;

import liquibase.change.AbstractChange;

public abstract class AbstractObjectPermissionChange extends AbstractChange {

	private String schemaName;
	private String objectName;
	private String recipientList;
	private Boolean select = Boolean.FALSE;
	private Boolean update = Boolean.FALSE;
	private Boolean insert = Boolean.FALSE;
	private Boolean delete = Boolean.FALSE;
	private Boolean execute = Boolean.FALSE;
	private Boolean grantOption = Boolean.FALSE;

	public AbstractObjectPermissionChange() {
		super();
	}

	public AbstractObjectPermissionChange( AbstractObjectPermissionChange other ) {
		this.schemaName = other.schemaName;
		this.objectName = other.objectName;
		this.recipientList = other.recipientList;
		this.select = other.select;
		this.update = other.update;
		this.insert = other.insert;
		this.delete = other.delete;
		this.execute = other.execute;
		this.grantOption = other.grantOption;
	}

	@Override
	public abstract String getConfirmationMessage();

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getRecipientList() {
		return recipientList;
	}

	public void setRecipientList(String recipientList) {
		this.recipientList = recipientList;
	}

	public Boolean getSelect() {
		if ( select == null ) {
			return false;
		}
		return select;
	}

	public void setSelect(Boolean select) {
		this.select = select;
	}

	public Boolean getUpdate() {
		if ( update == null ) {
			return false;
		}
		return update;
	}

	public void setUpdate(Boolean update) {
		this.update = update;
	}

	public Boolean getInsert() {
		if ( insert == null ) {
			return false;
		}
		return insert;
	}

	public void setInsert(Boolean insert) {
		this.insert = insert;
	}

	public Boolean getDelete() {
		if ( delete == null ) {
			return false;
		}
		return delete;
	}

	public void setDelete(Boolean delete) {
		this.delete = delete;
	}

	public Boolean getExecute() {
		if ( execute == null ) {
			return false;
		}
		return execute;
	}

	public void setExecute(Boolean execute) {
		this.execute = execute;
	}

	public Boolean getGrantOption() {
		if ( grantOption == null ) {
			return false;
		}
		return grantOption;
	}

	public void setGrantOption(Boolean grantOption) {
		this.grantOption = grantOption;
	}

}