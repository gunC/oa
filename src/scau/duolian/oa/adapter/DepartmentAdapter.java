package scau.duolian.oa.adapter;

import java.util.List;

import scau.duolian.oa.model.Wdbm;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class DepartmentAdapter extends BaseAdapter{
	private Activity activity;
	private List<Wdbm> wdbms;
	public DepartmentAdapter() {
		// TODO Auto-generated constructor stub
	}
	
	
	public DepartmentAdapter(Activity activity, List<Wdbm> wdbms) {
		super();
		this.activity = activity;
		this.wdbms = wdbms;
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return wdbms.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return wdbms.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
