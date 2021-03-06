/*
 * Copyright (C) 2016 Jens Reimann <jreimann@redhat.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.dentrassi.iot.w1;

import java.time.Instant;

public class ErrorSensorValue extends SensorValue {

    private final Throwable error;

    public ErrorSensorValue(final Sensor sensor, final Throwable error, final Instant timestamp) {
        super(sensor, timestamp);
        this.error = error;
    }

    public Throwable getError() {
        return this.error;
    }

    public String getReason() {
        return this.error.getMessage();
    }

    @Override
    public String toString() {
        return String.format("[%s: %s @ %s - %s]", getClass().getSimpleName(), this.sensor, this.timestamp,
                getReason());
    }
}
