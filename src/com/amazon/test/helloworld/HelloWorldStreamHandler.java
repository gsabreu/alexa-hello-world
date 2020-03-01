/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at

         http://aws.amazon.com/apache2.0/

     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.amazon.test.helloworld;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.amazon.test.helloworld.handlers.CancelandStopIntentHandler;
import com.amazon.test.helloworld.handlers.FallbackIntentHandler;
import com.amazon.test.helloworld.handlers.HelloWorldIntentHandler;
import com.amazon.test.helloworld.handlers.HelpIntentHandler;
import com.amazon.test.helloworld.handlers.LaunchRequestHandler;
import com.amazon.test.helloworld.handlers.SessionEndedRequestHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                // Add your skill id below
                .withSkillId("amzn1.ask.skill.17df47eb-f7e4-43d7-888c-25d97350f4b0")
                .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }

}
