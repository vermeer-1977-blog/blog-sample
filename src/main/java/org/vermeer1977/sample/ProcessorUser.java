/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *  Copyright © 2017 Yamashita,Takahiro
 */
package org.vermeer1977.sample;

import org.vermeer1977.generator.resource.enumconfig.Item;

public class ProcessorUser {

    /**
     * メイン本体
     *
     * @param args 実行時パラメータ
     */
    public static void main(String args[]) {
        for (Item item : Item.values()) {
            System.out.println(item);
        }
    }
}
