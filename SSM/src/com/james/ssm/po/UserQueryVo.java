package com.james.ssm.po;

import java.util.List;

public class UserQueryVo {
private  UserCustom userCustom;

private List<Integer> ids;

public UserCustom getUserCustom() {
	return userCustom;
}

public void setUserCustom(UserCustom userCustom) {
	this.userCustom = userCustom;
}

public List<Integer> getIds() {
	return ids;
}

public void setIds(List<Integer> ids) {
	this.ids = ids;
}

}
