/*
 * Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.ml.model.dto;

import org.json.JSONArray;

import java.io.Serializable;
import java.util.List;

public class LogisticRegressionModelSummary implements Serializable {
    private String roc;
    private double auc;
    private List<PredictedVsActual> predictedVsActuals;

    public double getAuc() {
        return auc;
    }

    public void setAuc(double auc) {
        this.auc = auc;
    }

    public List<PredictedVsActual> getPredictedVsActuals() {
        return predictedVsActuals;
    }

    public void setPredictedVsActuals(List<PredictedVsActual> predictedVsActuals) {
        this.predictedVsActuals = predictedVsActuals;
    }

    public String getRoc() {
        return roc;
    }

    public void setRoc(String roc) {
        this.roc = roc;
    }
}
