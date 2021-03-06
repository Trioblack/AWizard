/*
 * Copyright 2012 Roman Nurik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.dworks.libs.awizard.model.page;

import java.util.ArrayList;

import dev.dworks.libs.awizard.model.ReviewItem;
import dev.dworks.libs.awizard.model.WizardModelCallbacks;

/**
 * A page asking for a name and an email.
 */
public abstract class DonePage extends Page {

    public DonePage(WizardModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }
    
    @Override
    public void getReviewItems(ArrayList<ReviewItem> dest) {
    }
}
