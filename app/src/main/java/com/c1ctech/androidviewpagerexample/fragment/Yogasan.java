package com.c1ctech.androidviewpagerexample.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.c1ctech.androidviewpagerexample.R;


public class Yogasan extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view= inflater.inflate(R.layout.fragment_yogasan, container, false);
            ((ViewPager) view.findViewById(R.id.view_pager_yogashan)).setAdapter(new ImagePagerAdapter());
            return view;
    }


    private class ImagePagerAdapter extends PagerAdapter {
        private int[] mImages;
        private String[] poseDesc;

        private ImagePagerAdapter() {
            this.mImages = new int[]{R.drawable.bitilasan, R.drawable.ardhahalsan, R.drawable.majariasan, R.drawable.sarvangasan, R.drawable.trikonasan, R.drawable.yogic_jugging};
            this.poseDesc = new String[]{"1.Begin in a tabletop position, on your hands and your knees, with your knees stacked directly below your hips and your wrists, elbows and shoulder in line and perpendicular to the floor\n\n2.Center your head in a neutral position as you gaze as the floor\n\n3.As you inhale, lift your sitting bones and sternum toward the ceiling, as your belly sinks toward the floor\n\n4.Lift your head and gaze up", "1.Lie down on your back and breath in. Pull your legs at 90 degrees and slowly try to take your legs towards your head.\n\n2.Ensure that you focus on your breathing and don\u2019t lose control.\n\n3.Only extend your body as easily as possible. Don\u2019t over exert and slowly let your body become more flexible.", "1. Stand on all fours, such that your back forms a table top and your feet and hands from its legs.\n\n2. Your arms should be perpendicular to the floor, and your hands should be placed flat on the floor, right under your shoulders. Your knees should be placed hip-width apart.\n\n3. Look straight ahead.\n\n4. Inhale and raise your chin as you tilt your head backwards. Push your navel down and raise your tailbone. Compress your buttocks. You might feel a tingling sensation.\n\n5. Hold the pose for a few breaths. Breathe long and deep.", "1.Lie on your back with hands by your side.\n\n2.With one movement, lift your legs, buttocks and back so that you come up high on your shoulders. Support your back with the hands.\n\n3.Move your elbows closer towards each other, and move your hands along your back, creeping up towards the shoulder blades. Keep straightening the legs and spine by pressing the elbows down to the floor and hands into the back. Your weight should be supported on your shoulders and upper arms and not on your head and neck.\n\n4.Keep the legs firm. Lift your heels higher as though you are putting a footprint on the ceiling. Bring the big toes straight over the nose. Now point the toes up. Pay attention to your neck. Do not press the neck into the floor. Instead keep the neck strong with a feeling of tightening the neck muscles slightly. Press your sternum toward the chin. If you feel any strain in the neck, come out of the posture.\n\n5.Keep breathing deeply and stay in the posture for 30-60 seconds.\n\n6.To come out of the posture, lower the knees to forehead. Bring your hands to the floor, palms facing down. Without lifting the head slowly bring your spine down, vertebra by vertebra, completely to the floor. Lower the legs to the floor. Relax for a minimum of 60 seconds.", "1.Stand with your feet wide apart as much as possible and at a comfortable distance without losing your balance and poise.\n\n2.Stretch your arms at your sides and breath in. As you breathe in, bring your right hand next to the outside of the left foot and keep the other arm outstretched.\n\n3.Hold in this position for as long as possible. Do not bend your knees or arms. Try to stretch as much as possible. ", "1.You have to stand on both your feet.\n\n2.Stretch the arm at shoulder level and the second arm elbow bent at 90 degrees next to your body.\n\n3.Now, breathe in, extend the folded arms and retract the arm that you had extended. At the same time, move your leg opposite to the extended arm and ensure you lift it up as much as possible.\n\n4.This full extension of the arms and legs leaves you breathless and burns a lot of calories, expands your lung capacity and helps streamline the blood purification in the body."};
        }

        public int getCount() {

            return this.mImages.length;
        }

        public boolean isViewFromObject(View view, Object object) {
            return view == ((View) object);
        }

        public Object instantiateItem(ViewGroup container, int position) {
            FragmentActivity activity = getActivity();

            View view = ((LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.surya_namaskar_content, container, false);
            ((TextView) view.findViewById(R.id.textView)).setText(this.poseDesc[position]);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageResource(this.mImages[position]);
            ((ViewPager) container).addView(view, 0);
            return view;

        }

        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager) container).removeView((View) object);
        }
    }
}
