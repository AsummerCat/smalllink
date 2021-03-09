package com.example.smalllink.controller;

import com.example.smalllink.util.ConversionUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("smallLink")
public class SmallLinkController {


	@RequestMapping("get")
	public String getSmallLink() {
		//获取数据库自增主键
		Long id = 1000000000001123451L;

		//转换为62位进制
		String encode = ConversionUtil.encode(id);
		//转为数字
		long decode = ConversionUtil.decode(encode);

		System.out.println(encode);
		System.out.println(decode);
		return null;
	}
}
