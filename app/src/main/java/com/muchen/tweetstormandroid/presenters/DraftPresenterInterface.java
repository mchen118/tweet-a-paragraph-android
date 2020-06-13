package com.muchen.tweetstormandroid.presenters;

import com.muchen.tweetstormandroid.models.Draft;

import java.util.concurrent.ExecutionException;

public interface DraftPresenterInterface {
    void fetchAllDrafts();
    void fetchDraftById(long draftId);

    long insertNewDraftAndReturnId(Draft draft) throws ExecutionException, InterruptedException;

    void updateDraft(Draft draft);

    void deleteDraftById(long draftId);

    void handleDraftQuery(String pattern);
}
