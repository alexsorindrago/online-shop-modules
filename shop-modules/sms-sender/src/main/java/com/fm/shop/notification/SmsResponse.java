package com.fm.shop.notification;

public class SmsResponse {

    private String type;
    private Double code;
    private String error;
    private String detail;

    public SmsResponse(String type, Double code, String error, String detail) {
        this.type = type;
        this.code = code;
        this.error = error;
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCode() {
        return code;
    }

    public void setCode(Double code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    static class Data {

        private String status;
        private String smsId;
        private Double price;
        private Double credit;
        private String number;

        public Data(String status, String smsId, Double price, Double credit, String number) {
            this.status = status;
            this.smsId = smsId;
            this.price = price;
            this.credit = credit;
            this.number = number;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSmsId() {
            return smsId;
        }

        public void setSmsId(String smsId) {
            this.smsId = smsId;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Double getCredit() {
            return credit;
        }

        public void setCredit(Double credit) {
            this.credit = credit;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }
}
