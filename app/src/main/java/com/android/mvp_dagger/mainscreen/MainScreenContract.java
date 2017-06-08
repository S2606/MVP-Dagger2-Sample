package com.android.mvp_dagger.mainscreen;

import com.android.mvp_dagger.data.Post;

import java.util.List;

/**
 * Created by Shagun on 04/06/2017.
 */

public interface MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}
