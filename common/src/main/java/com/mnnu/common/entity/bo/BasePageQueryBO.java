package com.mnnu.common.entity.bo;

import com.mnnu.common.entity.vo.PageVO;
import lombok.Data;

import java.util.List;

@Data
public class BasePageQueryBO {
    private Integer current = 1;
    private Integer pageSize = 10;

    public String limitString() {
        return String.format(" limit %d,%d", (current - 1) * pageSize, pageSize);
    }
    public <T>PageVO<T> buildPage(List<T> list, Long total){
        return new PageVO<T>(list, total, current, pageSize);
    }
}
