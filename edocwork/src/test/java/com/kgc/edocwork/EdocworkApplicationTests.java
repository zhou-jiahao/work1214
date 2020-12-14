package com.kgc.edocwork;

import com.kgc.edocwork.pojo.Entry;
import com.kgc.edocwork.service.WorkService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class EdocworkApplicationTests {

	@Resource
	WorkService workService;

	@Test
	void contextLoads() {
		List<Entry> entrylist = workService.entrylist(1);
		for (Entry entry : entrylist) {
			System.out.println(entry.toString());
		}
	}
}
