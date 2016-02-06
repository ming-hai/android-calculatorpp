/*
 * Copyright 2013 serso aka se.solovyev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Contact details
 *
 * Email: se.solovyev@gmail.com
 * Site:  http://se.solovyev.org
 */

package org.solovyev.android.calculator.history;

import android.os.Bundle;

import org.solovyev.android.calculator.BaseActivity;
import org.solovyev.android.calculator.R;

import javax.annotation.Nullable;

import static org.solovyev.android.calculator.FragmentTab.history;
import static org.solovyev.android.calculator.FragmentTab.saved_history;

public class HistoryActivity extends BaseActivity {

    public HistoryActivity() {
        super(R.layout.main_empty, HistoryActivity.class.getSimpleName());
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ui.addTab(this, history, null, R.id.main_layout);
        ui.addTab(this, saved_history, null, R.id.main_layout);
    }
}