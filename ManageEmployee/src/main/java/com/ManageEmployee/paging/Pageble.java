package com.ManageEmployee.paging;

import com.ManageEmployee.paging.Sorter;

public interface Pageble {
	Integer getPage();
	Integer getOffset();
	Integer getLimit();
	Sorter getSorter();
}
