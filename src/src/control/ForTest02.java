package control;

public class ForTest02 {
	public static void main(String[] args) {
		/*
		 * int sum=0;
		 *for (int i=1; i<=3; i++) {
		 *	sum=sum+i;
		 * }
		 * System.out.println(sum);
		 * 
		 * */
		
		
		
		//1���� 1000���� 3�� ����� �հ� ���ϱ�
		int sum2=0;
		for (int i=1; i<=1000; i++) {
			if(i%3==0) {
				sum2=sum2+i;
			}
		}
		System.out.println("1���� 1000�� 3�� ����� �հ� : "+sum2);
		
		
	
		//1���� 1000������ �հ踦 ���� �� 3�� ����� ���ض�.
		int sum3=0;
		for(int a=3;a<=1000;a+=3) {
			sum3=sum3+a;
		}
		System.out.println("1���� 1000�� 3�� ����� �հ� : "+sum3);
		}
	}
	
	
/*
 * �ȵ���̵� �ִϸ��̼� ȿ�� �ֱ� - Main super.onCreate(savedInstanceState);
 * setContentView(R.layout.activity_main); Intent intent=new Intent(this,
 * ImageActivity.class); startActivity(intent); ����Ʈ�� ���� ImageActivity �� ����.
 * 
 * private ImageView imageView; // �̹����� ǥ�����ִ� �̹����� private Handler handler; //
 * UI�� �����ϱ� ���� �ڵ鷯 Ŭ����
 * 
 * int duration = 4000; // �̹����� ȸ���ϱ� ���� ����ð�. int rotation = 0; // �̹����� ȸ������. �ʱ�
 * ���� 0�� �̴�.
 * 
 * @Override protected void onCreate(Bundle savedInstanceState) {
 * super.onCreate(savedInstanceState); setContentView(R.layout.activity_image);
 * 
 * imageView = (ImageView)findViewById(R.id.image_view); // �̹����並 �޸𸮿� ����
 * handler = new Handler(); // �ڵ鷯 ��ü�� ����
 * 
 * // �̹����� �����ð� ���� �����ϱ� ���� ���ο� �����带 �����Ѵ�. Thread thread = new Thread(new
 * Runnable() {
 * 
 * @Override public void run() {
 * 
 * // while ���� ����ð��� 0 �̻��� �� ������ �۵��Ѵ�. while(duration >= 0){
 * 
 * // �ڵ鷯 ��ü�� UI�� ������� �ѱ��. // (UI�� ����� �ݵ�� �ڵ鷯 Ŭ�������� �ϵ��� �Ѵ�.) handler.post(new
 * Runnable() {
 * 
 * @Override public void run() { // 0.1�ʴ� �̹����� 20�� ȸ�� rotation += 20;
 * imageView.setRotation(rotation%360); } }); try { Thread.sleep(100); // �ش�
 * ������� 0.1�ʸ��� �ѹ��� �۵��Ѵ�.
 * 
 * duration -= 100; // ����ð� 0.1�ʸ�ŭ ����. } catch (InterruptedException e) {
 * e.printStackTrace(); } }
 * 
 * finish(); // �������� �۵��� ������ ���� ��Ƽ��Ƽ�� �ݴ´�. } });
 * 
 * // �������� �۵� ���� thread.start();
 * 
 * 
 */