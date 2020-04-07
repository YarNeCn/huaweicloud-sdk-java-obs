/**
 * Copyright 2019 Huawei Technologies Co.,Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.obs.services.model;

/**
 * 重命名文件/文件夹请求参数 <br>
 * 只有并行文件系统支持该接口
 * @since 3.20.3
 */
public class RenameObjectRequest extends GenericRequest {

    private String bucketName;

    private String objectKey;

    private String newObjectKey;

    public RenameObjectRequest() {

    }

    /**
     * 构造函数
     * 
     * @param bucketName
     *            桶名
     * @param objectKey
     *            文件/文件夹名
     * @param newObjectKey
     *            新的文件/文件夹名
     */
    public RenameObjectRequest(String bucketName, String objectKey, String newObjectKey) {
        super();
        this.bucketName = bucketName;
        this.objectKey = objectKey;
        this.newObjectKey = newObjectKey;
    }

    /**
     * 获取桶名
     * 
     * @return 桶名
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * 设置桶名
     * 
     * @param bucketName
     *            桶名
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * 获取文件/文件夹名
     * 
     * @return 文件/文件夹名
     */
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * 设置文件/文件夹名
     * 
     * @param objectKey
     *            文件/文件夹名
     * 
     */
    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    /**
     * 获取新的文件/文件夹名
     * 
     * @return 新的文件/文件夹名
     */
    public String getNewObjectKey() {
        return newObjectKey;
    }

    /**
     * 设置新的文件/文件夹名
     * 
     * @param newObjectKey
     *            新的文件/文件夹名
     */
    public void setNewObjectKey(String newObjectKey) {
        this.newObjectKey = newObjectKey;
    }

    @Override
    public String toString() {
        return "RenameObjectRequest [bucketName=" + bucketName + ", objectKey=" + objectKey + ", newObjectKey="
                + newObjectKey + ", isRequesterPays()=" + isRequesterPays() + "]";
    }
}
