package com.fanbo.zqbb.bean;

/**
 * Created by Eason Time 2020/4/30
 * <p>
 * Describe:
 */
public class LoginBean {

    /**
     * result : {"body":{"adzoneId":1.47546351E8,"agentAptitude":"silver_medal","agentFlag":1,"agentTime":"2018-08-07 21:35:36","alipayUser":"450752177@qq.com","createTime":"2018-08-07 20:22:27","headImgUrl":"http://whyjeeshop.oss-cn-shenzhen.aliyuncs.com/UserHeardView/1561574474596.jpg","invitationCode":"l9jpmd2","mobileNum":"13148897593","modelCode":"866260034738461","nickName":"夜神","openid2":"oic4N1rES_MLd989biO4TkoeXb3c","pddPid":"8986707_108131097","pid":"mm_128387951_39482542_147546351","positionId":1.829844871E9,"recommendCode":"l9jpmd","recommendUserId":0,"registerOrg":1,"registrationId":"120c83f7605a68473db","sex":1,"status":1,"superAgent":2,"superAgentId":0,"terminalUserId":3338,"terminalUserLevel":18,"terminalUserName":"康石明","tkUserId":73,"updateTime":"2020-05-13 18:19:36","userLevel":"one_level_commission","wechatId":"ogiRbv5DJsUlkuu0zWn6qhFspFTQ","wechatNo":"Eaaaa"},"resultCode":"8888","resultMsg":"操作成功"}
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * body : {"adzoneId":1.47546351E8,"agentAptitude":"silver_medal","agentFlag":1,"agentTime":"2018-08-07 21:35:36","alipayUser":"450752177@qq.com","createTime":"2018-08-07 20:22:27","headImgUrl":"http://whyjeeshop.oss-cn-shenzhen.aliyuncs.com/UserHeardView/1561574474596.jpg","invitationCode":"l9jpmd2","mobileNum":"13148897593","modelCode":"866260034738461","nickName":"夜神","openid2":"oic4N1rES_MLd989biO4TkoeXb3c","pddPid":"8986707_108131097","pid":"mm_128387951_39482542_147546351","positionId":1.829844871E9,"recommendCode":"l9jpmd","recommendUserId":0,"registerOrg":1,"registrationId":"120c83f7605a68473db","sex":1,"status":1,"superAgent":2,"superAgentId":0,"terminalUserId":3338,"terminalUserLevel":18,"terminalUserName":"康石明","tkUserId":73,"updateTime":"2020-05-13 18:19:36","userLevel":"one_level_commission","wechatId":"ogiRbv5DJsUlkuu0zWn6qhFspFTQ","wechatNo":"Eaaaa"}
         * resultCode : 8888
         * resultMsg : 操作成功
         */

        private BodyBean body;
        private String resultCode;
        private String resultMsg;

        public BodyBean getBody() {
            return body;
        }

        public void setBody(BodyBean body) {
            this.body = body;
        }

        public String getResultCode() {
            return resultCode;
        }

        public void setResultCode(String resultCode) {
            this.resultCode = resultCode;
        }

        public String getResultMsg() {
            return resultMsg;
        }

        public void setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
        }

        public static class BodyBean {
            /**
             * adzoneId : 1.47546351E8
             * agentAptitude : silver_medal
             * agentFlag : 1
             * agentTime : 2018-08-07 21:35:36
             * alipayUser : 450752177@qq.com
             * createTime : 2018-08-07 20:22:27
             * headImgUrl : http://whyjeeshop.oss-cn-shenzhen.aliyuncs.com/UserHeardView/1561574474596.jpg
             * invitationCode : l9jpmd2
             * mobileNum : 13148897593
             * modelCode : 866260034738461
             * nickName : 夜神
             * openid2 : oic4N1rES_MLd989biO4TkoeXb3c
             * pddPid : 8986707_108131097
             * pid : mm_128387951_39482542_147546351
             * positionId : 1.829844871E9
             * recommendCode : l9jpmd
             * recommendUserId : 0
             * registerOrg : 1
             * registrationId : 120c83f7605a68473db
             * sex : 1
             * status : 1
             * superAgent : 2
             * superAgentId : 0
             * terminalUserId : 3338
             * terminalUserLevel : 18
             * terminalUserName : 康石明
             * tkUserId : 73
             * updateTime : 2020-05-13 18:19:36
             * userLevel : one_level_commission
             * wechatId : ogiRbv5DJsUlkuu0zWn6qhFspFTQ
             * wechatNo : Eaaaa
             */

            private double adzoneId;
            private String agentAptitude;
            private int agentFlag;
            private String agentTime;
            private String alipayUser;
            private String createTime;
            private String headImgUrl;
            private String invitationCode;
            private String mobileNum;
            private String modelCode;
            private String nickName;
            private String openid2;
            private String pddPid;
            private String pid;
            private double positionId;
            private String recommendCode;
            private int recommendUserId;
            private int registerOrg;
            private String registrationId;
            private int sex;
            private int status;
            private int superAgent;
            private int superAgentId;
            private int terminalUserId;
            private int terminalUserLevel;
            private String terminalUserName;
            private int tkUserId;
            private String updateTime;
            private String userLevel;
            private String wechatId;
            private String wechatNo;

            public double getAdzoneId() {
                return adzoneId;
            }

            public void setAdzoneId(double adzoneId) {
                this.adzoneId = adzoneId;
            }

            public String getAgentAptitude() {
                return agentAptitude;
            }

            public void setAgentAptitude(String agentAptitude) {
                this.agentAptitude = agentAptitude;
            }

            public int getAgentFlag() {
                return agentFlag;
            }

            public void setAgentFlag(int agentFlag) {
                this.agentFlag = agentFlag;
            }

            public String getAgentTime() {
                return agentTime;
            }

            public void setAgentTime(String agentTime) {
                this.agentTime = agentTime;
            }

            public String getAlipayUser() {
                return alipayUser;
            }

            public void setAlipayUser(String alipayUser) {
                this.alipayUser = alipayUser;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getHeadImgUrl() {
                return headImgUrl;
            }

            public void setHeadImgUrl(String headImgUrl) {
                this.headImgUrl = headImgUrl;
            }

            public String getInvitationCode() {
                return invitationCode;
            }

            public void setInvitationCode(String invitationCode) {
                this.invitationCode = invitationCode;
            }

            public String getMobileNum() {
                return mobileNum;
            }

            public void setMobileNum(String mobileNum) {
                this.mobileNum = mobileNum;
            }

            public String getModelCode() {
                return modelCode;
            }

            public void setModelCode(String modelCode) {
                this.modelCode = modelCode;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public String getOpenid2() {
                return openid2;
            }

            public void setOpenid2(String openid2) {
                this.openid2 = openid2;
            }

            public String getPddPid() {
                return pddPid;
            }

            public void setPddPid(String pddPid) {
                this.pddPid = pddPid;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public double getPositionId() {
                return positionId;
            }

            public void setPositionId(double positionId) {
                this.positionId = positionId;
            }

            public String getRecommendCode() {
                return recommendCode;
            }

            public void setRecommendCode(String recommendCode) {
                this.recommendCode = recommendCode;
            }

            public int getRecommendUserId() {
                return recommendUserId;
            }

            public void setRecommendUserId(int recommendUserId) {
                this.recommendUserId = recommendUserId;
            }

            public int getRegisterOrg() {
                return registerOrg;
            }

            public void setRegisterOrg(int registerOrg) {
                this.registerOrg = registerOrg;
            }

            public String getRegistrationId() {
                return registrationId;
            }

            public void setRegistrationId(String registrationId) {
                this.registrationId = registrationId;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getSuperAgent() {
                return superAgent;
            }

            public void setSuperAgent(int superAgent) {
                this.superAgent = superAgent;
            }

            public int getSuperAgentId() {
                return superAgentId;
            }

            public void setSuperAgentId(int superAgentId) {
                this.superAgentId = superAgentId;
            }

            public int getTerminalUserId() {
                return terminalUserId;
            }

            public void setTerminalUserId(int terminalUserId) {
                this.terminalUserId = terminalUserId;
            }

            public int getTerminalUserLevel() {
                return terminalUserLevel;
            }

            public void setTerminalUserLevel(int terminalUserLevel) {
                this.terminalUserLevel = terminalUserLevel;
            }

            public String getTerminalUserName() {
                return terminalUserName;
            }

            public void setTerminalUserName(String terminalUserName) {
                this.terminalUserName = terminalUserName;
            }

            public int getTkUserId() {
                return tkUserId;
            }

            public void setTkUserId(int tkUserId) {
                this.tkUserId = tkUserId;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public String getUserLevel() {
                return userLevel;
            }

            public void setUserLevel(String userLevel) {
                this.userLevel = userLevel;
            }

            public String getWechatId() {
                return wechatId;
            }

            public void setWechatId(String wechatId) {
                this.wechatId = wechatId;
            }

            public String getWechatNo() {
                return wechatNo;
            }

            public void setWechatNo(String wechatNo) {
                this.wechatNo = wechatNo;
            }
        }
    }
}
