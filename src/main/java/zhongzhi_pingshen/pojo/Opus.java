package zhongzhi_pingshen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Opus {
    private Long opusId;//作品id
//    基本信息
    private String opusName;//作品名称
    private String opusType;//所属分类
    private String opusCourse;//所属课程
    private String opusSchool;//参赛学校
    private String opusParticipantNames;//参赛者姓名
    private String phoneNum;//联系电话
//    文件URL
    private String opusVideo;//课堂实录
    private String opusPlan;//教案
    private String opusReport;//教学实施报告
    private String opusMethod;//专业人才培养方案
    private String opusStandard;//课程标准
    private String opusApplicationTable;//参赛报名表
    private String opusSummaryTable;//汇总表
    private String opusSituationTable;//比赛情况统计表
}
