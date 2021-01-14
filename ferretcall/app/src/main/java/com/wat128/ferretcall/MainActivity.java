package com.wat128.ferretcall;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private SoundPool soundPool;
    private Map<String, Integer> sounds = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudioAttributes audioAttribute = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                .build();

        soundPool = new SoundPool.Builder()
                .setAudioAttributes(audioAttribute)
                .setMaxStreams(2)
                .build();

        LoadSound();
        LoadButtons();

    }

    private void LoadSound() {

        // 声
        sounds.put("guru01", soundPool.load(this, R.raw.guru01, 1));
        sounds.put("guru02", soundPool.load(this, R.raw.guru02, 1));
        sounds.put("oide01", soundPool.load(this, R.raw.oide01, 1));
        sounds.put("oide02", soundPool.load(this, R.raw.oide02, 1));
        sounds.put("teto01", soundPool.load(this, R.raw.teto01, 1));
        sounds.put("teto02", soundPool.load(this, R.raw.teto02, 1));
        sounds.put("rinrin01", soundPool.load(this, R.raw.rinrin01, 1));
        sounds.put("rinrin02", soundPool.load(this, R.raw.rinrin02, 1));

        // おもちゃ
        sounds.put("rion01", soundPool.load(this, R.raw.rion01, 1));
        sounds.put("rion02", soundPool.load(this, R.raw.rion02, 1));
        sounds.put("ahiru01", soundPool.load(this, R.raw.ahiru01, 1));
        sounds.put("ahiru02", soundPool.load(this, R.raw.ahiru02, 1));
        sounds.put("kaeru01", soundPool.load(this, R.raw.kaeru01, 1));
        sounds.put("kaeru02", soundPool.load(this, R.raw.kaeru02, 1));
        sounds.put("all01", soundPool.load(this, R.raw.all01, 1));
        // sounds.put("all02", soundPool.load(this, R.raw.all02, 1));

    }

    private void LoadButtons() {

        // 声
        findViewById(R.id.btn_guru01).setOnClickListener(this);
        findViewById(R.id.btn_guru02).setOnClickListener(this);
        findViewById(R.id.btn_oide01).setOnClickListener(this);
        findViewById(R.id.btn_oide02).setOnClickListener(this);
        findViewById(R.id.btn_teto01).setOnClickListener(this);
        findViewById(R.id.btn_teto02).setOnClickListener(this);
        findViewById(R.id.btn_rinrin01).setOnClickListener(this);
        findViewById(R.id.btn_rinrin02).setOnClickListener(this);

        // おもちゃ
        findViewById(R.id.btn_rion01).setOnClickListener(this);
        findViewById(R.id.btn_rion02).setOnClickListener(this);
        findViewById(R.id.btn_ahiru01).setOnClickListener(this);
        findViewById(R.id.btn_ahiru02).setOnClickListener(this);
        findViewById(R.id.btn_kaeru01).setOnClickListener(this);
        findViewById(R.id.btn_kaeru02).setOnClickListener(this);
        findViewById(R.id.btn_all01).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v != null) {
            switch (v.getId()) {

                // 声
                case R.id.btn_guru01:  soundPool.play(sounds.get("guru01"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_guru02:  soundPool.play(sounds.get("guru02"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_oide01:  soundPool.play(sounds.get("oide01"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_oide02:  soundPool.play(sounds.get("oide02"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_teto01:  soundPool.play(sounds.get("teto01"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_teto02:  soundPool.play(sounds.get("teto02"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_rinrin01:  soundPool.play(sounds.get("rinrin01"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_rinrin02:  soundPool.play(sounds.get("rinrin02"), 1.0f, 1.0f, 0, 0, 1); break;

                // おもちゃ
                case R.id.btn_rion01:  soundPool.play(sounds.get("rion01"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_rion02:  soundPool.play(sounds.get("rion02"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_ahiru01:  soundPool.play(sounds.get("ahiru01"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_ahiru02:  soundPool.play(sounds.get("ahiru02"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_kaeru01:  soundPool.play(sounds.get("kaeru01"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_kaeru02:  soundPool.play(sounds.get("kaeru02"), 1.0f, 1.0f, 0, 0, 1); break;
                case R.id.btn_all01:  soundPool.play(sounds.get("all01"), 1.0f, 1.0f, 0, 0, 1); break;

                default:
                    break;
            }
        }
    }
}
