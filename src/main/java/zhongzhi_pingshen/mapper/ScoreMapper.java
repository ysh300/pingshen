package zhongzhi_pingshen.mapper;

import zhongzhi_pingshen.pojo.OpusScore;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreMapper {

    @Insert("insert into opusscore(opusId, opusDesignScore, opusImplementScore, opusEffectScore, opusInnovationScore, opusComments) " +
            "VALUES (#{opusId},#{opusDesignScore},#{opusImplementScore},#{opusEffectScore},#{opusInnovationScore},#{opusComments})")
    void score(OpusScore opusScore);
}
