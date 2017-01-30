package app.com.example.althomas04.basichindi;

//custom array

public class word {

    /**
     * Default translation is the users native language
     */
    private String mDefaultTranslation;

    private String mHindiTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourseId;

    public word(String defaultTranslation, String hindiTranslation, int audioResourseId) {
        mDefaultTranslation = defaultTranslation;
        mHindiTranslation = hindiTranslation;
        mAudioResourseId = audioResourseId;
    }

    public word(String defaultTranslation, String hindiTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mHindiTranslation = hindiTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourseId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getHindiTranslation() {
        return mHindiTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourseId() {
        return mAudioResourseId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

