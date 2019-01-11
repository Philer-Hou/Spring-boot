package com.hourz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hourz.entity.Visitor;

/**
 * <p>Nginx对外请求接口</p>
 * @author hourz
 * @since 2019-01-10
 */
public interface VisitorRepository extends JpaRepository<Visitor, Long> {
	/**
	 * <p>根据IP地址查询</p>
	 * @param ip IP地址
	 * @return 
	 */
    Visitor findByIp(String ip);
}
