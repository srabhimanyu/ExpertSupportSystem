/*
 * Copyright 2016 Ruchir Gupta.
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
 */
package com.ess;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Ruchir Gupta
 */
public class Export_Schema {
    
    public static void main(String[] args) {
        AnnotationConfiguration ac=new AnnotationConfiguration();
        ac.addAnnotatedClass(AdminDetails.class);
        ac.addAnnotatedClass(Announcement.class);
        ac.addAnnotatedClass(AnswerDetails.class);
        ac.addAnnotatedClass(AssestsDetails.class);
        ac.addAnnotatedClass(AutoResponder.class);
        ac.addAnnotatedClass(CancelTicket.class);
        ac.addAnnotatedClass(ClientDetails.class);
        ac.addAnnotatedClass(FeeDetails.class);
        ac.addAnnotatedClass(GroupDetails.class);
        ac.addAnnotatedClass(LoginDetails.class);
        ac.addAnnotatedClass(RepresentativeDetails.class);
        ac.addAnnotatedClass(SessionDetails.class);
        ac.addAnnotatedClass(SolveTicket.class);
        ac.addAnnotatedClass(TicketDetails.class);
        ac.configure();
        
        new SchemaExport(ac).create(true, true);
    }
    
}
