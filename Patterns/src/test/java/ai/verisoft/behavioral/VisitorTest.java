/*
 * (C) Copyright 2024 VeriSoft (http://www.verisoft.co)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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
package ai.verisoft.behavioral;

import ai.verisoft.behavioral.visitor.*;
import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    public void testVisitor() {
        // Construct the query plan tree
        QueryPlanNode queryPlan = constructQueryPlan();

        // Apply optimization strategies
        QueryPlanVisitor costBasedOptimizer = new CostBasedOptimizer();
        QueryPlanVisitor ruleBasedOptimizer = new RuleBasedOptimizer();

        queryPlan.acceptVisitor(costBasedOptimizer);
        queryPlan.acceptVisitor(ruleBasedOptimizer);
    }


    private static QueryPlanNode constructQueryPlan() {
        // Construct and return a sample query plan tree
        return new SelectNode();
        // In a real-world scenario, this method would construct a more complex query plan tree
    }
}
