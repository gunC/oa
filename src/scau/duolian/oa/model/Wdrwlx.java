package scau.duolian.oa.model;

import scau.duolian.oa.base.BaseModel;

/**
 * 任务类型
 */

public class Wdrwlx extends BaseModel {
	public String id;
	public String title;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
	
	

}