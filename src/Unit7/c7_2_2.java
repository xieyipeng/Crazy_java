package Unit7;

/**
 * Runtime��
 * ����ʱ����
 * ����JVM�ķ���
 */
public class c7_2_2 {
    public static void main(String[] args)
            throws Exception {
        /**
         * //��ȡjava��������ʱ�����Ķ���
         * Runtime runtime=Runtime.getRuntime();
         * System.out.println("��������"+runtime.availableProcessors());
         * System.out.println("�����ڴ���"+runtime.freeMemory());
         * System.out.println("�ڴ�����"+runtime.totalMemory());
         * System.out.println("��������ڴ���"+runtime.maxMemory());
         * //�����
         * ��������4
         * �����ڴ���123518560
         * �ڴ�����126877696
         * ��������ڴ���1862270976
         */
        Runtime runtime = Runtime.getRuntime();
        //�������±�����
        runtime.exec("notepad.exe");
    }
}
