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
		
		
		
		//1부터 1000까지 3의 배수의 합계 구하기
		int sum2=0;
		for (int i=1; i<=1000; i++) {
			if(i%3==0) {
				sum2=sum2+i;
			}
		}
		System.out.println("1부터 1000중 3의 배수의 합계 : "+sum2);
		
		
	
		//1부터 1000까지의 합계를 구한 후 3의 배수를 구해라.
		int sum3=0;
		for(int a=3;a<=1000;a+=3) {
			sum3=sum3+a;
		}
		System.out.println("1부터 1000중 3의 배수의 합계 : "+sum3);
		}
	}
	
	
/*
 * 안드로이드 애니메이션 효과 넣기 - Main super.onCreate(savedInstanceState);
 * setContentView(R.layout.activity_main); Intent intent=new Intent(this,
 * ImageActivity.class); startActivity(intent); 인텐트를 통해 ImageActivity 를 띄운다.
 * 
 * private ImageView imageView; // 이미지를 표현해주는 이미지뷰 private Handler handler; //
 * UI를 제어하기 위한 핸들러 클래스
 * 
 * int duration = 4000; // 이미지를 회전하기 위한 제어시간. int rotation = 0; // 이미지의 회전각도. 초기
 * 값은 0도 이다.
 * 
 * @Override protected void onCreate(Bundle savedInstanceState) {
 * super.onCreate(savedInstanceState); setContentView(R.layout.activity_image);
 * 
 * imageView = (ImageView)findViewById(R.id.image_view); // 이미지뷰를 메모리에 적재
 * handler = new Handler(); // 핸들러 객체의 생성
 * 
 * // 이미지를 일정시간 동안 제어하기 위해 새로운 스레드를 생성한다. Thread thread = new Thread(new
 * Runnable() {
 * 
 * @Override public void run() {
 * 
 * // while 문은 제어시간이 0 이상일 때 까지만 작동한다. while(duration >= 0){
 * 
 * // 핸들러 객체로 UI의 제어권을 넘긴다. // (UI의 제어는 반드시 핸들러 클래스에서 하도록 한다.) handler.post(new
 * Runnable() {
 * 
 * @Override public void run() { // 0.1초당 이미지는 20도 회전 rotation += 20;
 * imageView.setRotation(rotation%360); } }); try { Thread.sleep(100); // 해당
 * 스레드는 0.1초마다 한번씩 작동한다.
 * 
 * duration -= 100; // 제어시간 0.1초만큼 차감. } catch (InterruptedException e) {
 * e.printStackTrace(); } }
 * 
 * finish(); // 스레드의 작동이 끝나고 나면 액티비티를 닫는다. } });
 * 
 * // 스레드의 작동 시작 thread.start();
 * 
 * 
 */