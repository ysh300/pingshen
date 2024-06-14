package zhongzhi_pingshen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpusScore {
    private long opusId;
    private Integer opusDesignScore;
    private Integer opusImplementScore;
    private Integer opusEffectScore;
    private Integer opusInnovationScore;
    private String opusComments;
    public Integer plusAll(){
        return opusDesignScore + opusImplementScore + opusEffectScore + opusInnovationScore;
    }

}
