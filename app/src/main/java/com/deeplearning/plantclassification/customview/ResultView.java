package com.deeplearning.plantclassification.customview;

import com.deeplearning.plantclassification.tflite.Classifier;

import java.util.List;

public interface ResultView {
    public void setResults(final List<Classifier.Recognition> results);
}
