package com.example.mmzhai.caloriculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextWatcher;
import android.text.Editable;
import android.widget.EditText;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText cycling, jogging, jumpingjack, leglift, plank, pullup, pushup, situp, squat, stairs, swimming, walking, calories;
    double cal_cycling, cal_jogging, cal_jumpingjack, cal_leglift, cal_plank, cal_pullup, cal_pushup, cal_situp, cal_squat, cal_stairs, cal_swimming, cal_walking, cal_calories;
    ArrayList<EditText> editList;
    ArrayList<Double> conversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        editList = new ArrayList<EditText>();
        conversion = new ArrayList<Double>();

        // setting up value for each exercise
        cycling = (EditText) findViewById(R.id.cycling_mins);
        cal_cycling = 100.0/12.0;
        editList.add(cycling);
        conversion.add(cal_cycling);

        jogging = (EditText) findViewById(R.id.jogging_mins);
        cal_jogging = 100.0/12.0;
        editList.add(jogging);
        conversion.add(cal_jogging);

        jumpingjack = (EditText) findViewById(R.id.jumpingjack_mins);
        cal_jumpingjack = 100.0/10.0;
        editList.add(jumpingjack);
        conversion.add(cal_jumpingjack);

        leglift = (EditText) findViewById(R.id.leglift_mins);
        cal_leglift = 100.0/25.0;
        editList.add(leglift);
        conversion.add(cal_leglift);

        plank = (EditText) findViewById(R.id.plank_mins);
        cal_plank = 100.0/25.0;
        editList.add(plank);
        conversion.add(cal_plank);

        pullup = (EditText) findViewById(R.id.pullup_mins);
        cal_pullup = 100.0/100.0;
        editList.add(pullup);
        conversion.add(cal_pullup);

        pushup = (EditText) findViewById(R.id.pushup_mins);
        cal_pushup = 100.0/350.0;
        editList.add(pushup);
        conversion.add(cal_pushup);

        situp = (EditText) findViewById(R.id.situp_mins);
        cal_situp = 100.0/250.0;
        editList.add(situp);
        conversion.add(cal_situp);

        squat = (EditText) findViewById(R.id.squat_mins);
        cal_squat = 100.0/225.0;
        editList.add(squat);
        conversion.add(cal_squat);

        stairs = (EditText) findViewById(R.id.stairs_mins);
        cal_stairs = 100.0/15.0;
        editList.add(stairs);
        conversion.add(cal_stairs);

        swimming = (EditText) findViewById(R.id.swimming_mins);
        cal_swimming = 100.0/13.0;
        editList.add(swimming);
        conversion.add(cal_swimming);

        walking = (EditText) findViewById(R.id.walking_mins);
        cal_walking = 100.0/20.0;
        editList.add(walking);
        conversion.add(cal_walking);

        calories = (EditText) findViewById(R.id.cal);
        cal_calories = 1.0;
        editList.add(calories);
        conversion.add(cal_calories);

        // total calories changed
        calories.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (calories.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(calories, str, 1.0);
                    }
                }
            }
        });
        // biking changed

        cycling.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (cycling.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(cycling, str, cal_cycling);
                    }
                }
            }
        });

        jogging.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (jogging.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(jogging, str, cal_jogging);
                    }
                }
            }
        });

        jumpingjack.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (jumpingjack.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(jumpingjack, str, cal_jumpingjack);
                    }
                }
            }
        });

        leglift.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (leglift.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(leglift, str, cal_leglift);
                    }
                }
            }
        });

        plank.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (plank.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(plank, str, cal_plank);
                    }
                }
            }
        });

        pullup.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (pullup.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(pullup, str, cal_pullup);
                    }
                }
            }
        });

        pushup.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (pushup.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(pushup, str, cal_pushup);
                    }
                }
            }
        });

        situp.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (situp.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(situp, str, cal_situp);
                    }
                }
            }
        });

        squat.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (squat.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(squat, str, cal_squat);
                    }
                }
            }
        });

        stairs.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (stairs.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(stairs, str, cal_stairs);
                    }
                }
            }
        });

        swimming.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (swimming.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(swimming, str, cal_swimming);
                    }
                }
            }
        });

        walking.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                if (walking.isFocused()) {
                    String str = s.toString();
                    if (!str.equals("")) {
                        setAllText(walking, str, cal_walking);
                    }
                }
            }
        });

    }

    private void setAllText(EditText exercise, String str, double cal) {
        double numcal = (double) (Integer.parseInt(str) * cal);
        for (int i = 0; i < editList.size(); i++) {
            if (!exercise.equals(editList.get(i))) {
                editList.get(i).setText("" + ((int) Math.round(numcal / conversion.get(i))));
            }
        }
    }

}
