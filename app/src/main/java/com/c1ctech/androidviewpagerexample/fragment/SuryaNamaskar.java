package com.c1ctech.androidviewpagerexample.fragment;

import android.content.Context;
import android.net.Uri;
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


public class SuryaNamaskar extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_surya_namaskar, container, false);
        ((ViewPager) view.findViewById(R.id.view_pager_suryanamaskar)).setAdapter(new ImagePagerAdapter());
        return view;
    }

    private class ImagePagerAdapter extends PagerAdapter {
        private int[] mImages;
        private String[] poseDesc;

        private ImagePagerAdapter() {
            this.mImages = new int[]{R.drawable.posepre, R.drawable.pose1, R.drawable.pose2, R.drawable.pose3, R.drawable.pose4, R.drawable.pose5, R.drawable.pose6, R.drawable.pose7, R.drawable.pose8, R.drawable.pose9, R.drawable.pose10};
            this.poseDesc = new String[]{"Inhale: As you breathe in, lift both arms up from the sides.\nExhale: As you exhale, bring your palms together in front of the chest in prayer position.", "Inhale : Breathing in, lift the arms up.", "Exhale : Exhale completely, bringing your hands down to the floor.", "Inhale : Bring the right foot forward in between the two hands, left knee down to the floor and look up.", "Inhale: As you breathe in, take the right leg back and bring the whole body in a straight line", "Exhale: Gently bring your two hands, two feet, two knees, chest and chin to touch the floor.", "Inhale: Keep your elbows bent and look up.", "Exhale: The inverted V.", "Inhale: Bring the left foot forward in between the two hands, right knee down to the floor and look up.", "Exhale: Bring your right foot forward and try to keep your palms on the floor.", "Inhale: Breathing in, lift the arms up."};
        }

        public int getCount() {
            return this.mImages.length;
        }

        public boolean isViewFromObject(View view, Object object) {
            return view == ((View) object);
        }

        public Object instantiateItem(ViewGroup container, int position) {
            FragmentActivity activity = getActivity();
            View view = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.surya_namaskar_content, container, false);
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
