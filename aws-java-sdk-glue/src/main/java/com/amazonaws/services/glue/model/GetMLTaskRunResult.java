/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTaskRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLTaskRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the task run.
     * </p>
     */
    private String transformId;
    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     */
    private String taskRunId;
    /**
     * <p>
     * The status for this task run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The names of the log groups that are associated with the task run.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The list of properties that are associated with the task run.
     * </p>
     */
    private TaskRunProperties properties;
    /**
     * <p>
     * The error strings that are associated with the task run.
     * </p>
     */
    private String errorString;
    /**
     * <p>
     * The date and time when this task run started.
     * </p>
     */
    private java.util.Date startedOn;
    /**
     * <p>
     * The date and time when this task run was last modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * The date and time when this task run was completed.
     * </p>
     */
    private java.util.Date completedOn;
    /**
     * <p>
     * The amount of time (in seconds) that the task run consumed resources.
     * </p>
     */
    private Integer executionTime;

    /**
     * <p>
     * The unique identifier of the task run.
     * </p>
     * 
     * @param transformId
     *        The unique identifier of the task run.
     */

    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * The unique identifier of the task run.
     * </p>
     * 
     * @return The unique identifier of the task run.
     */

    public String getTransformId() {
        return this.transformId;
    }

    /**
     * <p>
     * The unique identifier of the task run.
     * </p>
     * 
     * @param transformId
     *        The unique identifier of the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunResult withTransformId(String transformId) {
        setTransformId(transformId);
        return this;
    }

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     * 
     * @param taskRunId
     *        The unique run identifier associated with this run.
     */

    public void setTaskRunId(String taskRunId) {
        this.taskRunId = taskRunId;
    }

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     * 
     * @return The unique run identifier associated with this run.
     */

    public String getTaskRunId() {
        return this.taskRunId;
    }

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     * 
     * @param taskRunId
     *        The unique run identifier associated with this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunResult withTaskRunId(String taskRunId) {
        setTaskRunId(taskRunId);
        return this;
    }

    /**
     * <p>
     * The status for this task run.
     * </p>
     * 
     * @param status
     *        The status for this task run.
     * @see TaskStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for this task run.
     * </p>
     * 
     * @return The status for this task run.
     * @see TaskStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for this task run.
     * </p>
     * 
     * @param status
     *        The status for this task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatusType
     */

    public GetMLTaskRunResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for this task run.
     * </p>
     * 
     * @param status
     *        The status for this task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatusType
     */

    public GetMLTaskRunResult withStatus(TaskStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The names of the log groups that are associated with the task run.
     * </p>
     * 
     * @param logGroupName
     *        The names of the log groups that are associated with the task run.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The names of the log groups that are associated with the task run.
     * </p>
     * 
     * @return The names of the log groups that are associated with the task run.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The names of the log groups that are associated with the task run.
     * </p>
     * 
     * @param logGroupName
     *        The names of the log groups that are associated with the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunResult withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The list of properties that are associated with the task run.
     * </p>
     * 
     * @param properties
     *        The list of properties that are associated with the task run.
     */

    public void setProperties(TaskRunProperties properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * The list of properties that are associated with the task run.
     * </p>
     * 
     * @return The list of properties that are associated with the task run.
     */

    public TaskRunProperties getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * The list of properties that are associated with the task run.
     * </p>
     * 
     * @param properties
     *        The list of properties that are associated with the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunResult withProperties(TaskRunProperties properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>
     * The error strings that are associated with the task run.
     * </p>
     * 
     * @param errorString
     *        The error strings that are associated with the task run.
     */

    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    /**
     * <p>
     * The error strings that are associated with the task run.
     * </p>
     * 
     * @return The error strings that are associated with the task run.
     */

    public String getErrorString() {
        return this.errorString;
    }

    /**
     * <p>
     * The error strings that are associated with the task run.
     * </p>
     * 
     * @param errorString
     *        The error strings that are associated with the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunResult withErrorString(String errorString) {
        setErrorString(errorString);
        return this;
    }

    /**
     * <p>
     * The date and time when this task run started.
     * </p>
     * 
     * @param startedOn
     *        The date and time when this task run started.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time when this task run started.
     * </p>
     * 
     * @return The date and time when this task run started.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The date and time when this task run started.
     * </p>
     * 
     * @param startedOn
     *        The date and time when this task run started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunResult withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * The date and time when this task run was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The date and time when this task run was last modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when this task run was last modified.
     * </p>
     * 
     * @return The date and time when this task run was last modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when this task run was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The date and time when this task run was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunResult withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * The date and time when this task run was completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time when this task run was completed.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time when this task run was completed.
     * </p>
     * 
     * @return The date and time when this task run was completed.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * The date and time when this task run was completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time when this task run was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunResult withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the task run consumed resources.
     * </p>
     * 
     * @param executionTime
     *        The amount of time (in seconds) that the task run consumed resources.
     */

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the task run consumed resources.
     * </p>
     * 
     * @return The amount of time (in seconds) that the task run consumed resources.
     */

    public Integer getExecutionTime() {
        return this.executionTime;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the task run consumed resources.
     * </p>
     * 
     * @param executionTime
     *        The amount of time (in seconds) that the task run consumed resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTaskRunResult withExecutionTime(Integer executionTime) {
        setExecutionTime(executionTime);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTransformId() != null)
            sb.append("TransformId: ").append(getTransformId()).append(",");
        if (getTaskRunId() != null)
            sb.append("TaskRunId: ").append(getTaskRunId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getErrorString() != null)
            sb.append("ErrorString: ").append(getErrorString()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: ").append(getExecutionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLTaskRunResult == false)
            return false;
        GetMLTaskRunResult other = (GetMLTaskRunResult) obj;
        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        if (other.getTaskRunId() == null ^ this.getTaskRunId() == null)
            return false;
        if (other.getTaskRunId() != null && other.getTaskRunId().equals(this.getTaskRunId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getErrorString() == null ^ this.getErrorString() == null)
            return false;
        if (other.getErrorString() != null && other.getErrorString().equals(this.getErrorString()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode + ((getTaskRunId() == null) ? 0 : getTaskRunId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getErrorString() == null) ? 0 : getErrorString().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        return hashCode;
    }

    @Override
    public GetMLTaskRunResult clone() {
        try {
            return (GetMLTaskRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
