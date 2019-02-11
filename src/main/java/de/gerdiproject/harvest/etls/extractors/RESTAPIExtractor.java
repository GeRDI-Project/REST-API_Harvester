/**
 * Copyright © 2019 Manuel Scholz (http://www.gerdi-project.de)
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
package de.gerdiproject.harvest.etls.extractors;

import java.util.Iterator;

import de.gerdiproject.harvest.etls.AbstractETL;
import de.gerdiproject.harvest.utils.data.HttpRequester;

/**
 * This {@linkplain AbstractIteratorExtractor} implementation extracts all
 * (meta-)data from REST-API and bundles it into a {@linkplain RESTAPIVO}.
 *
 * @author Manuel Scholz
 */
public class RESTAPIExtractor extends AbstractIteratorExtractor<RESTAPIVO>
{
    private final HttpRequester httpRequester;

    private String version = null;
    private int size = -1;

    
    /**
     * Simple constructor.
     */
    public RESTAPIExtractor()
    {
        this.httpRequester = new HttpRequester();
    }


    @Override
    public void init(AbstractETL<?, ?> etl)
    {
        super.init(etl);

        this.httpRequester.setCharset(etl.getCharset());

        // TODO if possible, extract some metadata in order to determine the size and a version string
        // final RESTAPIETL specificEtl = (RESTAPIETL) etl;
        // this.version = ;
        // this.size = ;
    }


    @Override
    public String getUniqueVersionString()
    {
        return version;
    }



    @Override
    public int size()
    {
        return size;
    }



    @Override
    protected Iterator<RESTAPIVO> extractAll() throws ExtractorException
    {
        return new RESTAPIIterator();
    }


    /**
     * TODO add a description here
     *
     * @author Manuel Scholz
     */
    private class RESTAPIIterator implements Iterator<RESTAPIVO>
    {
        @Override
        public boolean hasNext()
        {
            // TODO
            return false;
        }


        @Override
        public RESTAPIVO next()
        {
            // TODO
            return null;
        }
    }
}
