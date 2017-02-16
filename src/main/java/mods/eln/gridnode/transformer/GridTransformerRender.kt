package mods.eln.gridnode.transformer

import mods.eln.gridnode.GridDescriptor
import mods.eln.gridnode.GridRender
import mods.eln.node.transparent.TransparentNodeDescriptor
import mods.eln.node.transparent.TransparentNodeEntity

/**
 * Created by svein on 07/08/15.
 */
class GridTransformerRender(entity: TransparentNodeEntity, descriptor: TransparentNodeDescriptor) : GridRender(entity, descriptor) {

    private val descriptor: GridDescriptor

    init {
        this.descriptor = descriptor as GridDescriptor
    }
}
