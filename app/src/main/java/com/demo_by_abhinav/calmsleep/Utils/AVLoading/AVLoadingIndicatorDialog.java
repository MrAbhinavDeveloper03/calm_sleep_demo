package com.demo_by_abhinav.calmsleep.Utils.AVLoading;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;



import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;

import com.demo_by_abhinav.calmsleep.R;

/*import com.aksha.mosaic_content_app.R;*/

/**
 *
 */
public class AVLoadingIndicatorDialog extends AlertDialog {

    private TextView mMessageView;

    public AVLoadingIndicatorDialog(Context context) {
        super(context);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.progress_avld, null);
//        view.setBackgroundColor(ContextCompat.getColor(context, android.R.color.darker_gray));
        mMessageView = (TextView) view.findViewById(R.id.message);
        // view.setBackgroundResource(R.color.transparent);
        //int backgroundColor = getResources().getColor(R.color.my_view_color);
        //view.setBackgroundColor(Color.parseColor("#00FFFFFF"));
        setView(view);

    }


    @Override
    public void setMessage(CharSequence message) {
        mMessageView.setText(message);
    }
}
