package kr.zalbazo.newzalbazo.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class TimeMapperTest {

    @Autowired
    private TimeMapper mapper;

    @Test
    public void getTimeTest() {
       log.info( mapper.getTime());
    }
}