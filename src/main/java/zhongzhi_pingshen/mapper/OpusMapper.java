package zhongzhi_pingshen.mapper;

import zhongzhi_pingshen.pojo.Opus;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface OpusMapper {

    @Insert("insert into opus(opusName, opusType, opusCourse, opusSchool, opusParticipantNames, phoneNum) " +
            "VALUES (#{opusName},#{opusType},#{opusCourse},#{opusSchool},#{opusParticipantNames},#{phoneNum})")
    void upload(Opus opus);

    List<Opus> list(String opusName);
}
