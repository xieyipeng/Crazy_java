package Unit6;

/**
 * ö����ĳ�Ա������������������
 */
enum Gender{//�Ա�
    MALE("��"),FEMALE("Ů");
    private final String name;
    Gender(String name) {
        this.name = name;
    }
//    public void setName(String name){
//        switch (this){
//            case MALE:
//                if (name.equals("��")){
//                    this.name=name;
//                }else{
//                    System.out.println("��������");
//                    return;
//                }
//                break;
//            case FEMALE:
//                if (name.equals("Ů")){
//                    this.name=name;
//                }else {
//                    System.out.println("��������");
//                    return;
//                }
//                break;
//        }
//    }
//    public String  getName(){
//        return this.name;
//    }

    public String getName() {
        return this.name;
    }
}
public class c6_9_3_1 {
    public static void main(String[] args) {
        /**
         * ö����Ĳ�����ʽ��һ����಻һ��
         */
        System.out.println(Gender.FEMALE);
        System.out.println(Gender.FEMALE.getName());
    }
}
