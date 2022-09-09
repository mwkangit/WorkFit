package com.example.v3.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.v3.R;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Signup extends AppCompatActivity {

    private EditText signupId;
    private EditText signupPwd;
    private EditText signupName;
    private EditText signupHeight;
    private EditText signupWeight;
    private Button signupBtn;

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        signupId = (EditText) findViewById(R.id.signupId);
        signupPwd = (EditText) findViewById(R.id.signupPwd);
        signupName = (EditText) findViewById(R.id.signupName);
        signupHeight = (EditText) findViewById(R.id.signupHeight);
        signupWeight = (EditText) findViewById(R.id.signupWeight);

        signupBtn = (Button) findViewById(R.id.signupBtn);

        // 회원가입 버튼 클릭
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = signupId.getText().toString().trim();
                String password = signupPwd.getText().toString().trim();
                String name = signupName.getText().toString().trim();
                String height = signupHeight.getText().toString().trim();
                String weight = signupWeight.getText().toString().trim();

                if (id.length() > 0 || password.length() > 0 || name.length() > 0) {


                    // get방식 파라미터 추가
//                    HttpUrl.Builder urlBuilder = HttpUrl.parse("117.16.137.155:8080/user/signUp").newBuilder();
//                    urlBuilder.addQueryParameter("v", "1.0"); // 예시
//                    String url = urlBuilder.build().toString();
                    String json = signupJson(id, password, name, height, weight);
                    System.out.println(json);
                    RequestBody body = RequestBody.create(json, JSON);
                    // POST 파라미터 추가
//                    RequestBody formBody = new FormBody.Builder()
//                            .add("email", id)
//                            .add("password", password)
//                            .add("name", name)
//                            .build();

//                    Log.d("signup json: ", formBody.toString());
                    // 요청 만들기
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder()
                            .url("http://117.16.137.115:8080/user/signUp")
                            .post(body)
                            .build();

//                    Response response = null;
//                    try {
//                        response = client.newCall(request).execute();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(response.body().toString());

                    // 응답 콜백
                    client.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {
                            e.printStackTrace();
                        }

                        @Override
                        public void onResponse(Call call, final Response response) throws IOException {
                            if (!response.isSuccessful()) {
                                // 응답 실패
                                Log.i("tag", "응답실패");
                            } else {
                                // 응답 성공
                                Log.i("tag", "응답 성공");
                                final String responseData = response.body().string();
                                // 서브 스레드 Ui 변경 할 경우 에러
                                // 메인스레드 Ui 설정
                                finish();

                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        try {
                                            Toast.makeText(getApplicationContext(), "회원가입 완료!", Toast.LENGTH_SHORT).show();
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    }
                                });
                            }
                        }
                    });

                    // 회원가입 종료 시점
                }
            }
        });


    }

    public String signupJson(String id, String password, String name, String height, String weight){

        return "{\"email\":\"" + id + "\","
                + "\"password\":\"" + password + "\","
                + "\"name\":\"" + name + "\","
                + "\"height\":\"" + height + "\","
                + "\"weight\":\"" + weight + "\"}";
    }
}
