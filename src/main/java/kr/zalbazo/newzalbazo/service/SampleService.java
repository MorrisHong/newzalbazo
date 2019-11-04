package kr.zalbazo.newzalbazo.service;

import kr.zalbazo.newzalbazo.mapper.TimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {


    @Autowired
    private TimeMapper timeMapper;

    public String getName() {
        return "grace";
    }

    public String now() {
        return timeMapper.getTime();
    }
}
