/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InstanceSummaryMarshaller
 */
public class InstanceSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceSummary instanceSummary,
            StructuredJsonGenerator jsonGenerator) {

        if (instanceSummary == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceSummary.getDeploymentId() != null) {
                jsonGenerator.writeFieldName("deploymentId").writeValue(
                        instanceSummary.getDeploymentId());
            }
            if (instanceSummary.getInstanceId() != null) {
                jsonGenerator.writeFieldName("instanceId").writeValue(
                        instanceSummary.getInstanceId());
            }
            if (instanceSummary.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(
                        instanceSummary.getStatus());
            }
            if (instanceSummary.getLastUpdatedAt() != null) {
                jsonGenerator.writeFieldName("lastUpdatedAt").writeValue(
                        instanceSummary.getLastUpdatedAt());
            }

            com.amazonaws.internal.SdkInternalList<LifecycleEvent> lifecycleEventsList = (com.amazonaws.internal.SdkInternalList<LifecycleEvent>) instanceSummary
                    .getLifecycleEvents();
            if (!lifecycleEventsList.isEmpty()
                    || !lifecycleEventsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("lifecycleEvents");
                jsonGenerator.writeStartArray();
                for (LifecycleEvent lifecycleEventsListValue : lifecycleEventsList) {
                    if (lifecycleEventsListValue != null) {

                        LifecycleEventJsonMarshaller.getInstance().marshall(
                                lifecycleEventsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceSummaryJsonMarshaller instance;

    public static InstanceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceSummaryJsonMarshaller();
        return instance;
    }

}