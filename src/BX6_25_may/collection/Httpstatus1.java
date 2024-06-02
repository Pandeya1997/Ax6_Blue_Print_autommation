package BX6_25_may.collection;

public class Httpstatus1 {
    public static void main(String[] args) {
        HTTPStatus status =  HTTPStatus.OK;
        HTTPStatus status1 =  HTTPStatus.CREATED;
        HTTPStatus status2 =  HTTPStatus.BAD_REQUEST;
        System.out.println(status.getCode()+ " _ " + status.getMessage());
        System.out.println(status1.getCode()+ " _ " + status1.getMessage());
        System.out.println(status2.getCode()+ " _ " + status2.getMessage());


    }
}
