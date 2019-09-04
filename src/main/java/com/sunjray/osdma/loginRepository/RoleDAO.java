package com.sunjray.osdma.loginRepository;

import java.util.List;

public interface RoleDAO {
	List<String> getRoleNames(Long userId);
}
